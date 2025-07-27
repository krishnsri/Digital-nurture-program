import './App.css';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore name="Lalith" school="Sri Vani matric hr sec school" total={450} goal={5} />
    </div>
  );
}

export default App;
