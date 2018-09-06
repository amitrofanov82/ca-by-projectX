import React from 'react'
import ReactDOM from 'react-dom'

class Component extends React.Component {
    render() {
        return (
            <div>I'm a component from index.js</div>
        )
    }
}

ReactDOM.render(
    <Component/>, document.getElementById('app')
)