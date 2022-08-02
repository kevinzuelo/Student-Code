import Vue from 'vue';
import VueRouter from 'vue-router';
import Home from '@/views/Home'
import MyBooks from '@/views/MyBooks'
import NewBookForm from '@/components/NewBookForm'
import BookPage from '@/views/BookPage'

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/myBooks',
    name: 'my-books',
    component: MyBooks
  },
  {
    path: '/addBook',
    name: 'add-book',
    component: NewBookForm
  },
  {
    path: '/book/:isbn',
    name: 'book-details-page',
    component: BookPage
  }

];

const router = new VueRouter({
  mode: 'history',
  routes
});

export default router;
