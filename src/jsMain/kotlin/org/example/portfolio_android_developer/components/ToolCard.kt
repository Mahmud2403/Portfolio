package org.example.portfolio_android_developer.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.example.portfolio_android_developer.util.Res
import org.jetbrains.compose.web.css.px

@Composable
fun ToolCard(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    icon: String?,
    tool: String,
    breakpoint: Breakpoint,
    colorMode: ColorMode,
) {
    Row(
        modifier = modifier
            .background(backgroundColor)
            .margin(topBottom = 6.px)
            .padding(
                topBottom = 6.px,
                leftRight = 4.px
            )
            .borderRadius(Res.Dimens.CARD_RADIUS.px),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        icon?.let {
            Image(
                modifier = Modifier
                    .size(if (breakpoint > Breakpoint.SM) Res.Dimens.ICON_SIZE_DM.px else Res.Dimens.ICON_SIZE_SM.px)
                    .margin(left = 8.px),
                src = it
            )
        }
        SpanText(
            modifier = Modifier
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(if (breakpoint > Breakpoint.SM) 14.px else 8.px)
                .margin(
                    leftRight = 8.px,
                ),
            text = tool,
        )
    }
}

enum class ToolIcon(val icon: String? = null, val iconLight: String? = null, val tool: String, val background: Color) {
    KOTLIN(
        icon = Res.Icon.KOTLIN,
        iconLight = Res.Icon.KOTLIN_LIGHT,
        tool = "Kotlin",
        background = Res.Colors.KOTLIN.color
    ),
    ANDROID(
        icon = Res.Icon.ANDROID,
        iconLight = Res.Icon.ANDROID_LIGHT,
        tool = "Android",
        background = Res.Colors.ANDROID.color
    ),
    JETPACK_COMPOSE(
        icon = Res.Icon.JETPACK_COMPOSE,
        iconLight = Res.Icon.JETPACK_COMPOSE_LIGHT,
        tool = "Jetpack Compose",
        background = Res.Colors.JETPACK_COMPOSE.color
    ),
    HILT(
        tool = "Hilt",
        background = Res.Colors.HILT.color
    ),
    DAGGER2(
        tool = "Dagger2",
        background = Res.Colors.DAGGER2.color
    ),
    KOIN(
        tool = "Koin",
        background = Res.Colors.KOIN.color
    ),
    RETROFIT(
        tool = "Retrofit",
        background = Res.Colors.RETROFIT.color
    ),
    KTOR(
        icon = Res.Icon.KTOR,
        iconLight = Res.Icon.KTOR_LIGHT,
        tool = "Ktor",
        background = Res.Colors.KTOR.color
    ),
    KOBWEB(
        icon = Res.Icon.KOBWEB,
        iconLight = Res.Icon.KOBWEB,
        tool = "KobWeb",
        background = Res.Colors.KOBWEB.color
    ),
    COROUTINES(
        tool = "Coroutines",
        background = Res.Colors.COROUTINES.color
    ),
    FLOW(
        tool = "Flow",
        background = Res.Colors.FLOW.color
    ),
    ROOM(
        tool = "Room",
        background = Res.Colors.ROOM.color
    ),
    COIL(
        tool = "Coil",
        background = Res.Colors.COIL.color
    ),
    GIT(
        icon = Res.Icon.GIT,
        iconLight = Res.Icon.GIT_LIGHT,
        tool = "Git",
        background = Res.Colors.GIT.color
    ),
    FIGMA(
        icon = Res.Icon.FIGMA,
        iconLight = Res.Icon.FIGMA_LIGHT,
        tool = "Figma",
        background = Res.Colors.FIGMA.color
    ),
    JIRA(
        icon = Res.Icon.JIRA,
        iconLight = Res.Icon.JIRA_LIGHT,
        tool = "Jira",
        background = Res.Colors.JIRA.color
    ),
}