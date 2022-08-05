import axios from 'axios';

const http = axios.create({
  baseURL: "http://icanhazdadjoke.com"
});

export default {

  getDadJoke() {
    return http.get('/', {
        headers: {
            "Accept": "application/json"
        }
    }).then( (response) => {
        return response.data.joke;
    });
  }
}