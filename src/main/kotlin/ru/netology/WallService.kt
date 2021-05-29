package ru.netology

class WallService {
    private var posts = emptyArray<Post>()           //создание массива
    private var comments = emptyArray<Comment>()
    fun add(post: Post): Post {             //метод для создания записи
        var post = post.copy(id = if (posts.isEmpty()) 1 else posts.last().id + 1)
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {          //метод для обновления записи
        for ((index, elementPost) in posts.withIndex()) {
            if (post.id == elementPost.id) {
                posts[index] = post.copy(ownerId = elementPost.ownerId, date = elementPost.date)
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for (i in posts) {
            if (i.id == comment.postId) {
                comments += comment
            } else throw PostNotFoundException("Идентификатор не совпадает")
        }
    }
}