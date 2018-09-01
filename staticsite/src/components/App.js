import React from 'react'
import Article from './Article'
import LoadData from './LoadData'

function App() {
    return (
        <div>
            <h1>App name</h1>
            <Article article={LoadData()[0]} />
        </div>
    )
}

export default App