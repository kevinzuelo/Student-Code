<template>
  <div>
    <h1>{{book.title}}</h1>
    <h2>{{book.author}}</h2>
    <img v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <p>{{book.read ? 'I have read this book' : 'I have not read this book'}}</p>
  </div>
</template>

<script>

export default {
  computed: {
        book() {
            return this.$store.state.books.find( (book) => {
                return book.isbn == this.$route.params.isbn
            });
        }
  }

}
</script>

<style>

</style>