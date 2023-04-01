const apiKey = '3fd2be6f0c70a2a598f084ddfb75487c';
const movieContainer = document.getElementById('movie-container');

function fetchMovies(url) {
  fetch(url)
    .then(response => response.json())
    .then(data => showMovies(data.results))
    .catch(error => console.log(error));
}

function showMovies(movies) {
  movieContainer.innerHTML = '';

  movies.forEach(movie => {
    const movieElement = document.createElement('div');
    movieElement.classList.add('movie');

    const movieImage = document.createElement('img');
    movieImage.src = `https://image.tmdb.org/t/p/w500/${movie.poster_path}`;
    movieImage.alt = movie.title;

    const movieTitle = document.createElement('h2');
    movieTitle.textContent = movie.title;

    const movieOverview = document.createElement('p');
    movieOverview.textContent = movie.overview;

    const movieRating = document.createElement('span');
    movieRating.textContent = movie.vote_average.toFixed(1);
    movieRating.classList.add('rating');

    movieElement.appendChild(movieImage);
    movieElement.appendChild(movieTitle);
    movieElement.appendChild(movieRating);
    movieElement.appendChild(movieOverview);

    movieContainer.appendChild(movieElement);
  });
}

const searchButton = document.getElementById('search-button');
searchButton.addEventListener('click', () => {
  const searchInput = document.getElementById('search');
  const searchTerm = searchInput.value.trim();

  if (searchTerm !== '') {
    const searchUrl = `https://api.themoviedb.org/3/search/movie?api_key=${apiKey}&query=${searchTerm}`;
    fetchMovies(searchUrl);
  }
});

const initialUrl = `https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=${apiKey}&page=1`;
fetchMovies(initialUrl);
