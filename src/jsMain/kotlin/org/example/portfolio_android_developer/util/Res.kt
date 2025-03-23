package org.example.portfolio_android_developer.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)),
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73)),
    }

    object Icon {
        const val EMAIL_LIGHT = "mail.svg"
        const val EMAIL_DARK = "mail_light.svg"

        const val GITHUB = "github.svg"
        const val GITHUB_LIGHT = "github_light.svg"

        const val INSTAGRAM = "instagram.svg"
        const val INSTAGRAM_LIGHT = "instagram_light.svg"

        const val GITLAB = "gitlab.svg"
        const val GITLAB_LIGHT = "gitlab_light.svg"

        const val SUN = "sun.svg"
        const val MOON = "moon.svg"

        const val TELEGRAM = "telegram.svg"
        const val TELEGRAM_LIGHT = "telegram_light.svg"

        const val KOTLIN = "kotlin.svg"
        const val KOTLIN_LIGHT = "kotlin_light.svg"

        const val ANDROID = "android.svg"
        const val ANDROID_LIGHT = "android_light.svg"

        const val JETPACK_COMPOSE = "jetpack_compose.svg"
        const val JETPACK_COMPOSE_LIGHT = "jetpack_compose_light.svg"

        const val KTOR = "ktor.svg"
        const val KTOR_LIGHT = "ktor_light.svg"

        const val GIT = "git.svg"
        const val GIT_LIGHT = "git_light.svg"

        const val FIGMA = "figma.svg"
        const val FIGMA_LIGHT = "figma_light.svg"

        const val JIRA = "jira.svg"
        const val JIRA_LIGHT = "jira_light.svg"

        const val KOBWEB = "kobweb.svg"
    }

    object Image {
        const val PROFILE_PHOTO = "photo.jpg"
    }

    enum class Colors(val color: Color) {
        ANDROID(color = Color.rgb(61, 220, 132)),
        KOTLIN(color = Color.rgb(127, 82, 255)),
        JETPACK_COMPOSE(color = Color.rgb(66, 133, 244)),
        HILT(Color.rgb(0, 129, 203)),
        DAGGER2(Color.rgb(0, 122, 204)),
        KOIN(Color.rgb(0, 129, 203)),
        RETROFIT(Color.rgb(255, 87, 34)),
        KOBWEB(Color.rgb(0x99, 0x33, 0xFF)),
        COROUTINES(Color.rgb(0, 149, 213)),
        FLOW(Color.rgb(0, 215, 210)),
        ROOM(Color.rgb(109, 179, 63)),
        COIL(Color.rgb(255, 202, 40)),
        GIT(Color.rgb(240, 80, 50)),
        FIGMA(Color.rgb(242, 78, 30)),
        JIRA(Color.rgb(0, 82, 204)),
        KTOR(color = Color.rgb(8, 124, 250))
    }

    object String {
        const val NAME = "Махмуд Гусейнов"
        const val PROFESSION = "Android Developer"
        const val ABOUT_ME =
            "Android-разработчик с опытом коммерческой разработки. " +
                    "Умею создавать удобные, стабильные и производительные мобильные приложения на Kotlin " +
                    "с использованием современных подходов. Следую принципам чистой архитектуры, " +
                    "пишу читаемый и поддерживаемый код. Есть мотивация изучать разработку на Kotlin Multiplatform," +
                    "создавать одновременно сайты и мобильные приложения под Android и IOS."
        const val BUTTON_TEXT = "Связаться"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:mahmud.dev.2003@gmail.com"
        const val SAVED_THEME = "theme"
        const val DEVELOPMENT_TOOLS = "Инструменты разработки:"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val CARD_RADIUS = 10
        const val MAX_CARD_WIDTH = 1200
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE_SM = 8
        const val ICON_SIZE_DM = 14
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }
}