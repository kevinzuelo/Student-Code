<template>
  <div>
    <button v-on:click="addRandomCard('dog')">Add new dog card</button>
    <button v-on:click="addRandomCard('fox')">Add new fox card</button>
    <div class="flexyCards">
      <card-detail v-for="(card, index) in filteredCards()" v-bind:key="index"
                 v-bind:card="card" />
    </div>
  </div>
</template>

<script>
import CardDetail from '@/components/CardDetail.vue';
import foxService from '@/services/FoxService.js';
import dadJokeService from '@/services/DadJokeService.js';
import dogService from '@/services/DogService.js';

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
        if (whichImage === 'dog') {
          service = dogService;
        }
        else if (whichImage === 'fox') {
          service = foxService;
        }
        service.getImage().then((response) => {
            newCard.url = response;
        }).catch(() => {
            newCard.caption = newCard.Caption + " Image Error";
        });
        dadJokeService.getDadJoke().then((response) => {
            newCard.caption = response;
        }).catch(error => {
            newCard.caption = error.response.status + ' ' + error.response.statusText;
        });
        this.$store.commit("ADD_CARD", newCard);
      },
      filteredCards() {
        return this.$store.state.cards.filter( (card) => {
          if (this.animal == '') {
            return true;
          }
          else if (this.animal === card.imgService) {
            return true;
          }

          return false;

        });
      }
    },
    created() {
        this.addRandomCard();
    }    
}
</script>

<style>
.flexyCards {
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
}

</style>