import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    activeProduct: 0,
    filter: 0,
    products: [
      {
        id: 1,
        name: "Cigar Parties for Dummies",
        description: "Host and plan the perfect cigar party for all of your squirrelly friends.",
        reviews: [
          {
            id: 1001,
            reviewer: 'Malcolm Gladwell',
            title: 'What a book!',
            review:
              "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language.",
            rating: 3,
            favorited: false
          },
          {
            id: 1002,
            reviewer: 'Tim Ferriss',
            title: 'Had a cigar party started in less than 4 hours.',
            review:
              "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
            rating: 4,
            favorited: false
          },
          {
            id: 1003,
            reviewer: 'Ramit Sethi',
            title: 'What every new entrepreneurs needs. A door stop.',
            review:
              "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
            rating: 1,
            favorited: false
          },
          {
            id: 1004,
            reviewer: 'Gary Vaynerchuk',
            title: 'And I thought I could write',
            review:
              "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
            rating: 3,
            favorited: false
          }
        ]
      },
      {
        id: 2,
        name: "Personal Finance for Dummies",
        description: "",
        reviews: []
      },
      {
        id: 3,
        name: "Project Management for Dummies",
        description: "",
        reviews: []
      },
      {
        id: 4,
        name: "Critical Thinking Skills for Dummies",
        description: "",
        reviews: []
      },
      {
        id: 5,
        name: "Home Maintenance for Dummies",
        description: "",
        reviews: []
      },
      {
        id: 5,
        name: "Home Maintenance for Dummies",
        description: "",
        reviews: []
      },
      {
        id: 6,
        name: 'Un Lun Dun',
        description: "Un Lun Dun is a place where words are alive, a jungle lurks behind the door of an ordinary house, carnivorous giraffes stalk the streets, and a dark cloud dreams of burning the world. It is a city awaiting its hero.",
        reviews: [
          {
            id: 1005,
            reviewer: "Phrynne",
            title: "Great. A bit long",
            review: "I always love China Miéville's imagination and the fantastic things he does with his worlds. In this book Un Lun Dun is a different kind of London containing places such as Webminster Abby (covered in webs and the home of a kind of spider). As with many young adult books (and this one is for the younger end of that category) the main characters are children who are smarter than the nasty grown ups who are out to get them. That was all good though and Reeba was a very smart, tough young lady.Not the author's best book but still very enjoyable and I bet he had an absolute ball writing it",
            rating: 4,
            favorited: false
          },
          {
            id: 1006,
            reviewer: "Stephen",
            title: "Double Facepalm",
            review: "Let me begin this sadly negative review by saying that I think China Mieville is one of the BEST writers working today. To put it simply…he is THE MAN!! Unfortunately, and it pains me to say, he is THE MAN in this case that wrote a really shitty book. It happens to the best of artists at some point in their career. Al Pacino did \"Author, Author\", Steven Spielberg did \"Always\" and even Will Ferrell did \"Bewitched\". Well, this is Mr. Mieville’s \"Ishtar\", sans Dustin Hoffman and Warren Beatty.",
            rating: 1,
            favorited: false
          },
          {
            id: 1007,
            reviewer: "Catie",
            title: "A very enjoyable ride",
            review: "Wow. How do I describe this book? It’s on the one hand a bit of an ode to all of the quest based, parallel world containing fantasies that have come before: The Wizard of Oz, Narnia, Mary Poppins, Alice in Wonderland, most of Neil Gaiman’s catalogue, hell even Harry Potter. On the other hand, it undermines the typical tenets of these books in a way that’s a bit of a fuck you to the whole genre. It also manages to transcend both of these things and become a decent quest based, parallel world containing fantasy itself. It’s fun, playful, and sometimes just downright silly. I wish that I could morph into Will Ferrell as James Lipton right now and declare it delightful. There are a few things that I could have done without, but for the most part I really enjoyed this book.",
            rating: 4,
            favorited: false
          },
          {
            id: 1008,
            reviewer: "Susan",
            title: "Derivative tosh",
            review: "A poor man's Neverwhere. I'll admit that I stopped reading after 115 pages.",
            rating: 2,
            favorited: false
          },
          {
            id: 1009,
            reviewer: "Amber",
            title: "As if Hyao Miyazaki met Neil Gaiman in a bar",
            review: "What do you get if you cross one of Hyao Miyazaki's animated films with Neil Gaiman's Neverwhere, the imagination of Clive Barker, and Alice in Wonderland? You get this book: Un Lun Dun by China Mieville. When young friends Zanna and Deeba follow a broken umbrella down to a sewer with a steering wheel, they turn it and enter the world of Un Lun Dun. Un Lun Dun (or UnLondon) is an urban wonderland where things that are thrown away in regular london are found and given a new purpose there. Upon entering the strange new land, Zanna and Deeba encounter a variety of strange creatures from an animated milk carton who acts like a puppy, ghosts, carnivorous giraffes, a man who when he speaks creates his own creatures, a flying british bus, garbage can ninjas, and a whole lot of other creatures who believe that Zanna is the one to save them from the dreaded smog. Can the friends save this new land from the smog? Read on to find out.",
            rating: 5,
            favorited: false
          },
          {
            id: 1010,
            reviewer: "Arie",
            title: "okay, but heavy-handed",
            review: "My first introduction to Miéville's writing was Railsea. I had an almost instant reaction to it (confusion, frustration, amazement) that only grew stronger as the story progressed (and changed into shock, awe and adoration, and finished with the literary equivalent of being hit on the head with a shovel). Un Lun Dun disappointed me for the supremely unfair (on my behalf) reason that it didn't draw much of a reaction from me.",
            rating: 3,
            favorited: false
          },
          {
            id: 1011,
            reviewer: "Frances",
            title: "Just wow!",
            review: "This was great! A gritty, Pratchetty, deceptive, in control Dorothy type fairy tale with a satisfying end. Only my second Miéville but I want to read everything he's written right now.",
            rating: 5,
            favorited: false
          }
        ]
      }
        
    ]
  },
  mutations: {
    ADD_REVIEW(state,review) {
      const product = this.state.products.find(p => p.id == review.productID);

      // Get the next review id. Normally, a database would assign a unique id for the review.
      // This code simulates that since there's no database in this example.

      let maxID = product.id * 1000;
      // Use the reduce() array function to find the highest review.id currently in the array
      maxID = product.reviews.reduce( (maxID, review) => {
        return Math.max(maxID, review.id);
      }, maxID);
      // Set the new id
      review.id = maxID + 1;
      // Add the new review to the front of the reviews array
      product.reviews.unshift(review);
    },
    UPDATE_FILTER(state, filter) {
      state.filter = filter;
    },
    FLIP_FAVORITED(state, reviewToChange) {
      reviewToChange.favorited = ! reviewToChange.favorited;
    },
    SET_ACTIVE_PRODUCT(state, productID) {
      state.activeProduct = productID;
    }
  },
  actions: {
  },
  modules: {
  },
  strict: true
})
