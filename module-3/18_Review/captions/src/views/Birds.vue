<template>
  <div class="home">
    <card-list animal="bird" />
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
