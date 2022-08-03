<template>
  <div>
    <div class="loading" v-if="isLoading">
      <img v-if="!isTiredOfPingPong" src="../assets/ping_pong_loader.gif" />
      <img v-else v-bind:src='foxImage' />
    </div>
    <div v-else>
      <h1>{{ card.title }}</h1>
      <p>{{ card.description }}</p>

      <router-link v-bind:to="{ name: 'Board', params: { id: $route.params.boardID} }">Back to Board</router-link>

      <comments-list v-bind:comments="card.comments" />
    </div>
  </div>
</template>

<script>
import boardsService from '@/services/BoardService.js';
import foxService from '@/services/FoxService.js';
import CommentsList from '@/components/CommentsList.vue';

export default {
  name: "card-detail",
  components: {
    CommentsList
  },
  data() {
    return {
      card: {
        title: '',
        description: '',
        status: '',
        comments: []
      },
      isLoading: true,
      isTiredOfPingPong: false,
      foxImage: ''
    }
  },
  created() {
    boardsService.getCard(this.$route.params.boardID, this.$route.params.cardID)
                 .then((response) => {
                   this.card = response;
                   this.isLoading = false;
                 });
    foxService.getRandomFox().then((response) => {
      this.foxImage = response;
      this.isTiredOfPingPong = true;
    });
  }
};
</script>
