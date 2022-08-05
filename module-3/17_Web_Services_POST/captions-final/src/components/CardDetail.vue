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
export default {
    name: 'card-detail',
    data() {
        return {
            isLoading: false,
            card: {
                url: 'https://randomfox.ca/images/93.jpg',
                caption: 'Some random text'
            }
        }
    }

}
</script>

<style>

</style>