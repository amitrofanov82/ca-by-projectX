import React from 'react'

function Article(props) {
    const {article} = props
    const body = <section>{article.description}</section>
    return (
        <div>
            <h2>{article.name}</h2>
            {body}
        </div>
    )
}

export default Article