import './App.css';
import CohortDetails from './Components/CohortDetails';

function App() {
  return (
    <div className="App">
      <h2>My Academy Dashboard</h2>
      <CohortDetails name="ReactJS July 2025" trainer="John Doe" status="ongoing" />
      <CohortDetails name="Java Spring May 2025" trainer="Jane Smith" status="completed" />
    </div>
  );
}

export default App;
