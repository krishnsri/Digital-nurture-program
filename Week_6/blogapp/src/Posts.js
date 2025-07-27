import React, { Component } from 'react';
import Post from './Post';

export class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null
    };
  }

  // Fetch posts using fetch API
  loadPosts = async () => {
    try {
      const response = await fetch('https://jsonplaceholder.typicode.com/posts');
      if (!response.ok) {
        throw new Error(`HTTP error! status: ${response.status}`);
      }
      const data = await response.json();
      const posts = data.map(post => new Post(post.userId, post.id, post.title, post.body));
      this.setState({ posts });
    } catch (error) {
      this.setState({ error });
    }
  };

  // Lifecycle hook for data loading
  componentDidMount() {
    this.loadPosts();
  }

  // Lifecycle hook for catching errors
  componentDidCatch(error, info) {
    alert("An error occurred: " + error.message);
  }

  render() {
    const { posts, error } = this.state;

    if (error) {
      return <p>Error loading posts.</p>;
    }

    return (
      <div>
        <h2>Blog Posts</h2>
        {posts.map(post => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
