<template>
  <div>
    <h1>{{card.title}}</h1>
    <p>{{card.description}}</p>


  </div>
</template>

<script>
import BoardService from "@/services/BoardService";

export default {

  name: "card-detail",
  data() {
    return {
      card: {
        title: '',
        description: '',
        status: '',
        comments: []
      }
    }
  },
  computed() {
    BoardService.getCard(this.$route.params.boardID, this.$route.params.cardID)
    .then((response) => {
      this.card = response;
    })
  }
};
</script>
