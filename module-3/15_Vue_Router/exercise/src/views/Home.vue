<template>
  <div>
      <new-releases-list/>
      <best-seller-list/>
  </div>
</template>

<script>
import BestSellerList from '@/components/BestSellerList'
import NewReleasesList from '@/components/NewReleasesList'
export default {
    components: {
        BestSellerList,
        NewReleasesList
    }

}
</script>

<style>

</style>