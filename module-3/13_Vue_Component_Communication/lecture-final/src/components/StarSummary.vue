<template>
  <div class="well">
    <span class="amount" v-on:click="updateFilter()">{{ numberOfReviews }}</span>
    {{ rating }} Star Review{{ numberOfReviews === 1 ? '' : 's' }}
  </div>
</template>

<script>
export default {
  name: "star-summary",
  props: ["rating"],
  methods: {
    updateFilter() {
      // this.$store.state.filter = parseInt(this.rating); DO NOT DO THIS!
      this.$store.commit("UPDATE_FILTER", parseInt(this.rating));
      this.$store.commit("ADD_TO_COUNTER");
    }
  },
  computed: {
    numberOfReviews() {
      return this.$store.state.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === parseInt(this.rating) ? 1 : 0);
      }, 0);
    }
  }
};
</script>

