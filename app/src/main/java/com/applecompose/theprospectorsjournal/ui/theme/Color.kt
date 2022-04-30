package com.applecompose.theprospectorsjournal.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)


//Light
val Primary = Color(0xff96480c)
val Secondary = Color(0xFF765847)
val OnSurfaceVariant = Color(0xFF52443c)
val OnSurface = Color(0xFF201a17)
val OnPrimary = Color(0xFFffffff)
val OnSecondary = Color(0xFFffffff)
val PrimaryVariant = Color(0xFF5d6136)
val NewBackground = Color(0xFFffdcb8)

//Dark
val DarkPrimary = Color(0xffffb688)
val DarkSecondary = Color(0xFFe5bfaa)
val DarkOnSurfaceVariant = Color(0xFFd7c2b8)
val DarkOnSurface = Color(0xFFece0db)
val DarkOnPrimary = Color(0xFF532200)
val DarkOnSecondary = Color(0xFF432b1c)
val DarkPrimaryVariant = Color(0xFFc6cb95)
val DarkNewBackground = Color(0xFF2c1700)




val Amber200 = Color(0xFFffe54c)
val Amber500 = Color(0xFFffb300)
val Amber700 = Color(0xFFc68400)
val LightAmber = Color(0xFFffecb3)

val MediumGreen = Color(0xFF3BAE06)



val Tan = Color(0xFFDDBC83)

val Colors.mediumGreen: Color
    @Composable
    get() = if (isLight) MediumGreen else MediumGreen


val Colors.newBackgroundColor: Color
    @Composable
    get() = if (isLight) NewBackground else DarkNewBackground

val Colors.fontColor: Color
    @Composable
    get() = if (isLight) DarkOnSecondary else DarkOnPrimary
