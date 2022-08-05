import axios from 'axios';

const http = axios.create({
  baseURL: "https://randomfox.ca"
});

export default {

  getFox() {
    return http.get('/floof').then( (response) => {
        return response.data.image;
    });
  }
}