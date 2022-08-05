import axios from 'axios';

const http = axios.create({
  baseURL: "https://some-random-api.ml/animal/birb"
});

export default {

  getImage() {
    return http.get('/', {
        headers: {
            "Accept": "application/json"
        }
    }).then( (response) => {
        return response.data.image;
    });
  }
}