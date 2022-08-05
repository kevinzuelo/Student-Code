<template>
  <div class="card">
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
    props: ['card'],
    data() {
        return {
            isLoading: false,
        }
    }

}
</script>

<style>

figure img {
    max-width:200px;
}

figcaption {
    font-size: 1.3em;
}

figure {
    border: 4px solid blue;
    border-radius: 25px;
    max-width: 400px;
}

</style>