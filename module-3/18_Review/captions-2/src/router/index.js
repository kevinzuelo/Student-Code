import Vue from 'vue';
import VueRouter from 'vue-router';
import Cards from '../views/Cards.vue';
import DogCards from '@/views/DogCards.vue';
import FoxCards from '@/views/FoxCards.vue';

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Cards',
    component: Cards
  },
  {
    path: '/dogs',
    name: 'DogCards',
    component: DogCards
  },
  {
    path: '/foxes',
    name: 'FoxCards',
    component: FoxCards
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
