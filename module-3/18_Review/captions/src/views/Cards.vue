<template>
  <div class="home">
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
