<template>
  <div id="app" class="main">
      <h1>{{ product.name }}</h1>
      <p class="description">{{ product.description }}</p>
      <div class="actions">
          <router-link v-bind:to="{ name: 'products' }">Products</router-link> | 
          <router-link v-bind:to="{ name: 'add-review', params: { id: product.id } }">Add Review</router-link>
      </div>
      <div class="well-display">
          <average-summary />
          <star-summary v-for="n in 5" v-bind:key="n" v-bind:rating="n" title="Yahoo!" />
      </div>
      <review-list />
    </div>
</template>

<script>
import AverageSummary from '../components/AverageSummary.vue';
import StarSummary from '@/components/StarSummary.vue'
import ReviewList from '@/components/ReviewList.vue'
export default {
  components: { 
      AverageSummary, 
      StarSummary,
      ReviewList
    },
    name: "product-detail",
    computed: {
        product() {
            return this.$store.state.products.find( (p) => {
                return p.id == this.$store.state.activeProduct
            });
        }
    },
    created() {
        const activeProductId = this.$route.params.id;
        this.$store.commit("SET_ACTIVE_PRODUCT", activeProductId);
    }

}
</script>

<style>

</style>