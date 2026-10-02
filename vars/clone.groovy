def call(string url, string branch){
  echo 'this cloning'
  git url: "${url}" , branch: "${branch}"
  echo "succesfully code cloned"
}
