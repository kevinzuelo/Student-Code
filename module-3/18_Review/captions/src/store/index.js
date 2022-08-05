import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    cards: []
  },
  mutations: {
    ADD_CARD(state, card) {
      state.cards.unshift(card);
    }
  },
  actions: {
  },
  modules: {
  }
})
