import axios from 'axios';

const http = axios.create({
  baseURL: "https://icanhazdadjoke.com"
});

export default {

  getJoke() {
    return http.get('/', {
        headers: {
            "Accept": "application/json"
        }
    }).then( (response) => {
        return response.data.joke;
    });
  }
}