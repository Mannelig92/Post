package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService()
        // заполняем несколькими постами
        val add = service.add(
            Post(
                0,
                4,
                7,
                34,
                4,
                "text5",
                8,
                81,
                true,
                "text5",
                "text5",
                13,
                22,
                14,
                "text5",
                12,
                true,
                true,
                true,
                true,
                true,
                true,
                33,
                21,
                "text5",
                "text5",
                "text5"
            )
        )
        val result = Post(
            1,
            4,
            7,
            34,
            4,
            "text5",
            8,
            81,
            true,
            "text5",
            "text5",
            13,
            22,
            14,
            "text5",
            12,
            true,
            true,
            true,
            true,
            true,
            true,
            33,
            21,
            "text5",
            "text5",
            "text5"
        )
        assertEquals(result, add)
    }

    @Test
    fun updateTrue() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(
            Post(
                1,
                0,
                1,
                1,
                5,
                "text",
                1,
                1,
                true,
                "text",
                "text",
                3,
                2,
                1,
                "text",
                2,
                true,
                true,
                true,
                true,
                true,
                true,
                3,
                2,
                "text5",
                "text5",
                "text5"
            )
        )
        service.add(
            Post(
                1,
                1,
                4,
                5,
                5,
                "text",
                1,
                1,
                true,
                "text",
                "text",
                11,
                23,
                14,
                "text",
                21,
                true,
                true,
                true,
                true,
                true,
                true,
                8,
                4,
                "text5",
                "text5",
                "text5"
            )
        )
        service.add(
            Post(
                1,
                5,
                7,
                4,
                5,
                "text2",
                5,
                14,
                true,
                "text2",
                "text2",
                6,
                17,
                94,
                "text2",
                57,
                true,
                true,
                true,
                true,
                true,
                true,
                17,
                23,
                "text5",
                "text5",
                "text5"
            )
        )
        // создаём информацию об обновлении
        val updateTrue = Post(
            1,
            15,
            27,
            14,
            5,
            "text6",
            5,
            14,
            true,
            "text6",
            "text6",
            67,
            127,
            954,
            "text6",
            557,
            true,
            true,
            true,
            true,
            true,
            true,
            617,
            923,
            "text5",
            "text5",
            "text5"
        )

        // выполняем целевое действие
        val result = service.update(updateTrue)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(
            Post(
                1,
                0,
                1,
                1,
                5,
                "text",
                1,
                1,
                true,
                "text",
                "text",
                3,
                2,
                1,
                "text",
                2,
                true,
                true,
                true,
                true,
                true,
                true,
                3,
                2,
                "text5",
                "text5",
                "text5"
            )
        )
        // создаём информацию об обновлении
        val updateFalse = Post(
            2,
            15,
            27,
            14,
            5,
            "text6",
            5,
            14,
            true,
            "text6",
            "text6",
            67,
            127,
            954,
            "text6",
            557,
            true,
            true,
            true,
            true,
            true,
            true,
            617,
            923,
            "text5",
            "text5",
            "text5"
        )
        // выполняем целевое действие
        val result = service.update(updateFalse)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

    @Test
    fun createCommentTrue() {
        // создаём целевой сервис
        val service = WallService()
        service.add(
            Post(
                1,
                0,
                1,
                1,
                5,
                "text",
                1,
                1,
                true,
                "text",
                "text",
                3,
                2,
                1,
                "text",
                2,
                true,
                true,
                true,
                true,
                true,
                true,
                3,
                2,
                "text5",
                "text5",
                "text5"
            )
        )
        service.createComment(
            Comment(
                1,
                1,
                3,
                "HI",
                22,
                34,
                12,
                123
            )
        )
    }

    @Test(expected = PostNotFoundException::class)
    fun createCommentFalse() {
// создаём целевой сервис
        val service = WallService()
        service.add(
            Post(
                1,
                0,
                1,
                1,
                5,
                "text",
                1,
                1,
                true,
                "text",
                "text",
                3,
                2,
                1,
                "text",
                2,
                true,
                true,
                true,
                true,
                true,
                true,
                3,
                2,
                "text5",
                "text5",
                "text5"
            )
        )
        service.createComment(
            Comment(
                2,
                2,
                3,
                "HI",
                22,
                34,
                12,
                123
            )
        )
    }
}