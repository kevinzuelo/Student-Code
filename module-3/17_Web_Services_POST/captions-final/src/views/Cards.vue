<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <card-list />
  </div>
</template>

<script>
// @ is an alias to /src
import CardList from '@/components/CardList.vue'

export default {
  name: 'Cards',
  components: {
    CardList
  }
}
</script>
