
import './App.css';
import HelloClass from './HelloClass';
import HelloFunction from './HelloFunction';
import HelloState from './HelloState';
import RouterEx from './RouterEx';
import { Sample } from './Sample';
import TestReducer from './TestReducer';
import UseEffectHook from './UseEffectHook';
import UseStateEx from './UseStateEx';

function App() {
  return (
    <div className="App">
      <h1>welcome to react js</h1>
      <HelloClass />
      <HelloFunction />
      <Sample name = "mohan" />
      <HelloState />
      <UseStateEx />
      <RouterEx />
      <TestReducer />
      <UseEffectHook />
    </div>
  );
}

export default App;
