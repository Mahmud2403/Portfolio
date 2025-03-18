package org.example.portfolio_android_developer.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.example.portfolio_android_developer.util.Res
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px

@Composable
fun ThemeSwitchButton(
    colorMode: ColorMode,
    onToggle: () -> Unit
) {
    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Fixed)
            .zIndex(1)
            .styleModifier {
                property("pointer-events", "none")
            },
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Top
    ) {
        IconButton(
            modifier = Modifier
                .margin(all = if (breakpoint > Breakpoint.SM) 24.px else 16.px)
                .styleModifier {
                    property("pointer-events", "auto")
                },
            colorMode = colorMode,
            icon = if (colorMode.isLight) Res.Icon.SUN else Res.Icon.MOON,
            iconSize = if (breakpoint > Breakpoint.SM) Res.Dimens.ICON_SIZE_LG.px else Res.Dimens.ICON_SIZE.px,
            onClick = onToggle
        )
    }
}