import axios from 'axios';

const http = axios.create({
  baseURL: "https://randomfox.ca"
});

export default {

  getImage() {
    return http.get('/floof').then( (response) => {
        return response.data.image;
    });
  }
}