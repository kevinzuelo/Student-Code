<template>
    <form class="new-book-form" v-on:submit.prevent="addNewBook(newBook)">
      <div>
        <label for="title" >Title</label>
        <input id="title" class="title-input" type="text" v-model="newBook.title" />
      </div>
      <div>
        <label for="author">Author:</label>
        <input id="author" class="author-input" type="text" v-model="newBook.author" />
      </div>
      <div>
        <label for="isbn">ISBN:</label>
        <input id="isbn" class="isbn-input" type="text" v-model="newBook.isbn" />
      </div>
     
      <input type="submit" value="Add Book" />
    </form>

</template>

<script>

export default {
    data() {
        return {
            newBook: {
            title: '',
            author: '',
            read: false,
            isbn: ''
            }
        };
    },
    name: 'new-book-form',
    methods: {
      addNewBook(book) {
        this.$store.commit('ADD_BOOK', book );
      }
    }
}
</script>
