import axios from 'axios';

const http = axios.create({
  baseURL: "https://random.dog"
});

export default {

  getImage() {
    return http.get('/woof.json').then( (response) => {
        return response.data.url;
    });
  }
}