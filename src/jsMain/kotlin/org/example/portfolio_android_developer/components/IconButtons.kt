package org.example.portfolio_android_developer.components

import androidx.compose.runtime.*
import org.example.portfolio_android_developer.util.Res
import org.example.portfolio_android_developer.util.Res.Dimens.BORDER_RADIUS
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    colorMode: ColorMode,
    link: String = "",
    icon: String = "",
    iconSize: CSSSizeValue<CSSUnit.px> = Res.Dimens.ICON_SIZE.px,
    onClick: (() -> Unit)? = null,
) {
    var isHovered by remember { mutableStateOf(false) }

    Link(
        path = link,
    ) {
        Div(
            attrs = {
                onMouseOver { isHovered = true }
                onMouseOut { isHovered = false }
            }
        ) {
            Box(
                modifier = modifier
                    .rotate(if (isHovered) 10.deg else 0.deg)
                    .background(
                        if (colorMode.isLight) Res.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color
                        else Res.Theme.SOCIAL_ICON_BACKGROUND_DARK.color
                    )
                    .padding(all = 8.px)
                    .borderRadius(r = BORDER_RADIUS.px)
                    .cursor(Cursor.Pointer)
                    .border(
                        width = 1.px,
                        style = LineStyle.Solid,
                        color = if (colorMode.isLight) Res.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color
                        else Res.Theme.SOCIAL_ICON_BACKGROUND_DARK.color
                    )
                    .onClick { onClick?.invoke() },
            ) {
                Image(
                    modifier = Modifier.size(iconSize),
                    src = icon
                )
            }
        }
    }
}

enum class SocialIcon(
    val icon: String,
    val link: String
) {
    Github(
        icon = Res.Icon.GITHUB,
        link = "https://github.com/Mahmud2403"
    ),
    GithubLight(
        icon = Res.Icon.GITHUB_LIGHT,
        link = "https://github.com/Mahmud2403"
    ),
    Gitlab(
        icon = Res.Icon.GITLAB,
        link = "https://gitlab.com/Mahmud24"
    ),
    GitlabLight(
        icon = Res.Icon.GITLAB_LIGHT,
        link = "https://gitlab.com/Mahmud24"
    ),
//    Instagram(
//        icon = Res.Icon.INSTAGRAM,
//        link = "https://www.instagram.com/stevdza_san"
//    ),
//    InstagramLight(
//        icon = Res.Icon.INSTAGRAM_LIGHT,
//        link = "https://www.instagram.com/stevdza_san"
//    )
    Telegram(
        icon = Res.Icon.TELEGRAM,
        link = "https://t.me/android_dev_05"
    ),
    TelegramLight(
        icon = Res.Icon.TELEGRAM_LIGHT,
        link = "https://t.me/android_dev_05"
    )
}