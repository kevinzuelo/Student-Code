import axios from 'axios';

const httpFox = axios.create({
  baseURL: "https://randomfox.ca"
});

export default {

  getRandomFox() {
    return httpFox.get('/floof').then((response) => {
      return response.data.image;
    })
  }

}
