<template>
  <div>
    <button v-on:click="addRandomCard('fox')">Add new fox</button>
    <button v-on:click="addRandomCard('bird')">Add new bird</button>
      <div class ="flexCards">
        <card-detail v-for="(card, index) in filteredCards()" v-bind:key="index" v-bind:card="card" />
      </div>
  </div>
</template>

<script>
import CardDetail from '@/components/CardDetail.vue';
import foxService from '@/services/FoxService.js';
import dadJokeService from '@/services/DadJokeService.js'
import birdService from '@/services/BirdService.js'

export default {
    name: 'card-list',
    props: ['animal'],
    components: {
        CardDetail
    },
    methods: {
      addRandomCard(whichImage) {
        let service = foxService;
        let newCard = {
          url: '',
          caption: '',
          imgService: ''
        };
        newCard.imgService = whichImage;
        if(whichImage === 'bird') {
          service = birdService;
        }
        service.getImage().then((response) => {
           newCard.url = response;

        }).catch(error => {
            newCard.caption = error.response.status + ' ' + error.response.statusText;
        });
        dadJokeService.getJoke().then((response) => {
            newCard.caption = response;

        }).catch(error => {
            newCard.caption = error.response.status + ' ' + error.response.statusText;
        });
        this.$store.commit('ADD_CARD', newCard);
      },
      filteredCards() {
        return this.$store.state.cards.filter((card) => {
          if(this.animal == '') {
            return true;
          }
          else if (this.animal == card.imgService) {
            return true;
          }
          else {
            return false;
          }
          })
      }
    },
    created() {
      this.addRandomCard();
    }
}
</script>

<style>

.flexCards {
  display: flex;
  flex-wrap: wrap;
}

</style>