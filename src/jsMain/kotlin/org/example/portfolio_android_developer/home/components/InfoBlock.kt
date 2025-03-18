package org.example.portfolio_android_developer.home.components

import androidx.compose.runtime.*
import org.example.portfolio_android_developer.components.IconButton
import org.example.portfolio_android_developer.components.SocialIcon
import org.example.portfolio_android_developer.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun InfoBlock(
    breakpoint: Breakpoint,
    colorMode: ColorMode
) {
    var isHovered by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 50.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.MD) Alignment.CenterHorizontally else Alignment.Start
    ) {
        SpanText(
            text = Res.String.NAME,
            modifier = Modifier
                .margin(bottom = 12.px)
                .fontFamily(Res.String.ROBOTO_CONDENSED)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(50.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                )
        )
        SpanText(
            text = Res.String.PROFESSION,
            modifier = Modifier
                .margin(bottom = 24.px)
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .fontSize(18.px)
        )

        Surface(
            modifier = Modifier
                .height(4.px)
                .width(40.px)
                .margin(bottom = 24.px)
                .background(
                    if (colorMode.isLight) Res.Theme.BLUE.color
                    else Res.Theme.LIGHT_BLUE.color
                )
                .align(
                    if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally else Alignment.Start
                )
        ) {}

        SpanText(
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .fontSize(14.px)
                .color(if (colorMode.isLight) Colors.Black else Colors.White)
                .opacity(50.percent)
                .lineHeight(2)
                .margin(bottom = 36.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                ),
            text = Res.String.ABOUT_ME
        )

        Button(
            modifier = Modifier
                .onMouseOver { isHovered = true }
                .onMouseOut { isHovered = false }
                .margin(bottom = 50.px),
            size = ButtonSize.LG,
            onClick = { window.location.href = Res.String.MY_EMAIL }
        ) {
            Image(
                modifier = Modifier
                    .padding(leftRight = if (isHovered) 20.px else 12.px)
                    .transition(Transition.of(property = "all", duration = 300.ms))
                    .margin(right = 12.px),
                src = if (colorMode.isLight) Res.Icon.EMAIL_LIGHT
                else Res.Icon.EMAIL_DARK
            )
            SpanText(
                modifier = Modifier
                    .fontSize(14.px)
                    .color(
                        if (colorMode.isLight) Colors.White
                        else Res.Theme.GRADIENT_ONE_DARK.color
                    )
                    .fontWeight(FontWeight.Bold)
                    .fontFamily(Res.String.ROBOTO_REGULAR),
                text = Res.String.BUTTON_TEXT,
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .gap(12.px),
            horizontalArrangement = if (breakpoint <= Breakpoint.SM) Arrangement.Center else Arrangement.Start,
        ) {
            SocialIcon.entries
                .filter {
                    if (colorMode.isLight) !it.name.contains("Light")
                    else it.name.contains("Light")
                }.forEach {
                    IconButton(
                        colorMode = colorMode,
                        icon = it.icon,
                        link = it.link,
                        onClick = {}
                    )
                }
        }
    }
}