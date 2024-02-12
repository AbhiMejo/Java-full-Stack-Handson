import logo from './logo.svg';
import './App.css';
import Myapp from './components/Myapp';
import Myheader from './components/Myheader';
import Myfooter from './components/Myfooter';
import Myclass from './components/Myclass';
function App() {
  return (
    <div className="App">
      
      <Myapp name="Abhishek"/>
      <Myheader/>
      <Myfooter/>
      <Myclass/>
    </div>
  );
}

export default App;
