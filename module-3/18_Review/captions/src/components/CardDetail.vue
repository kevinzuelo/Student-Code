<template>
  <div class="card">
      <h2>Card</h2>
      <div v-if="isLoading">
          <img src="../assets/logo.png" />
      </div>
      <div v-else>
          <figure>
              <img v-bind:src="card.url" />
              <figcaption>{{ card.caption }}</figcaption>
          </figure>
      </div>
  </div>
</template>

<script>
import foxService from '@/services/FoxService.js';

export default {
    name: 'card-detail',
    data() {
        return {
            isLoading: false,
            card: {
                url: '',
                caption: ''
            }
        }
    },
    created() {
        foxService.getFox().then((response) => {
            alert(response);
            this.card.image = response;
        }).catch(error => {
            alert('Ooops');
            this.card.caption = error.response.status + ' ' + error.response.statusText;
        })
    }

}
</script>

<style>

</style>