import './App.css'
import Header from './components/Header'
import Buttonlist from './components/Buttonlist'

function App() {
  const liste = ['Cool Button', 'Cool Button 69', 'Cool Button 420']

  return (
    <>
      <Header info= 'Start'/>
      <Buttonlist myarray={liste}/>
    </>
  )
}

export default App
