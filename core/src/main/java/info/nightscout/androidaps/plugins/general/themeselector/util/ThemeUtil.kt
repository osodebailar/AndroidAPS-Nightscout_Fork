package info.nightscout.androidaps.plugins.general.themeselector.util

import info.nightscout.androidaps.core.R
import info.nightscout.androidaps.plugins.general.themeselector.model.Theme
import info.nightscout.androidaps.utils.DateUtil
import info.nightscout.androidaps.utils.sharedPreferences.SP
import java.util.*

/**
 * Created by Pankaj on 12-11-2017.
 */
object ThemeUtil {
    const val THEME_RED = 0
    const val THEME_PINK = 1
    const val THEME_PURPLE = 2
    const val THEME_DEEPPURPLE = 3
    const val THEME_INDIGO = 4
    const val THEME_BLUE = 5
    const val THEME_LIGHTBLUE = 6
    const val THEME_CYAN = 7
    const val THEME_TEAL = 8
    const val THEME_GREEN = 9
    const val THEME_LIGHTGREEN = 10
    const val THEME_LIME = 11
    const val THEME_YELLOW = 12
    const val THEME_AMBER = 13
    const val THEME_ORANGE = 14
    const val THEME_DEEPORANGE = 15
    const val THEME_BROWN = 16
    const val THEME_GRAY = 17
    const val THEME_BLUEGRAY = 18
    const val THEME_DARKSIDE = 19

    @JvmStatic fun getThemeId(theme: Int): Int {
        var themeId = 0
        when (theme) {
            THEME_RED        -> themeId = R.style.AppTheme_RED
            THEME_PINK       -> themeId = R.style.AppTheme_PINK
            THEME_PURPLE     -> themeId = R.style.AppTheme_PURPLE
            THEME_DEEPPURPLE -> themeId = R.style.AppTheme_DEEPPURPLE
            THEME_INDIGO     -> themeId = R.style.AppTheme_INDIGO
            THEME_BLUE       -> themeId = R.style.AppTheme_BLUE
            THEME_LIGHTBLUE  -> themeId = R.style.AppTheme_LIGHTBLUE
            THEME_CYAN       -> themeId = R.style.AppTheme_CYAN
            THEME_TEAL       -> themeId = R.style.AppTheme_TEAL
            THEME_GREEN      -> themeId = R.style.AppTheme_GREEN
            THEME_LIGHTGREEN -> themeId = R.style.AppTheme_LIGHTGREEN
            THEME_LIME       -> themeId = R.style.AppTheme_LIME
            THEME_YELLOW     -> themeId = R.style.AppTheme_YELLOW
            THEME_AMBER      -> themeId = R.style.AppTheme_AMBER
            THEME_ORANGE     -> themeId = R.style.AppTheme_ORANGE
            THEME_DEEPORANGE -> themeId = R.style.AppTheme_DEEPORANGE
            THEME_BROWN      -> themeId = R.style.AppTheme_BROWN
            THEME_GRAY       -> themeId = R.style.AppTheme_GRAY
            THEME_BLUEGRAY   -> themeId = R.style.AppTheme_BLUEGRAY
            THEME_DARKSIDE   -> themeId = R.style.AppTheme_DARKSIDE

            else             -> {
            }
        }
        return themeId
    }

    @JvmStatic  fun getThemeName(theme: Int, mIsNightMode: Boolean): String {
        var themeName = ""
        when (theme) {
            THEME_RED        -> themeName =  if ( mIsNightMode) "Ferrari" else "RED light"
            THEME_PINK       -> themeName = if ( mIsNightMode) "PINK dark" else "PINK light"
            THEME_PURPLE     -> themeName = if ( mIsNightMode) "PURPLE dark" else "PURPLE light"
            THEME_DEEPPURPLE -> themeName = if ( mIsNightMode) "DEEP PURPLE dark" else "DEEP PURPLE light"
            THEME_INDIGO     -> themeName = if ( mIsNightMode) "INDIGO dark" else "INDIGO light"
            THEME_BLUE       -> themeName = if ( mIsNightMode) "BLUE dark" else "BLUE light"
            THEME_LIGHTBLUE  -> themeName = if ( mIsNightMode) "LIGHTBLUE dark" else "Frozen"
            THEME_CYAN       -> themeName = if ( mIsNightMode) "CYAN dark" else "CYAN light"
            THEME_TEAL       -> themeName = if ( mIsNightMode) "Teal" else "Teal"
            THEME_GREEN      -> themeName = if ( mIsNightMode) "GREEN dark" else "GREEN light"
            THEME_LIGHTGREEN -> themeName = if ( mIsNightMode) "LIGHTGREEN dark" else "LIGHTGREEN light"
            THEME_LIME       -> themeName = if ( mIsNightMode) "Aurora borealis" else "LIME light"
            THEME_YELLOW     -> themeName = if ( mIsNightMode) "YELLOW dark" else "Minions"
            THEME_AMBER      -> themeName = if ( mIsNightMode) "Amber dark" else "Amber light"
            THEME_ORANGE     -> themeName = if ( mIsNightMode) "Orange dark" else "Orange light"
            THEME_DEEPORANGE -> themeName = if ( mIsNightMode) "DEEPORANGE dark" else "DEEPORANGE light"
            THEME_BROWN      -> themeName = if ( mIsNightMode) "BROWN dark" else "BROWN light"
            THEME_GRAY       -> themeName = if ( mIsNightMode) "GRAY dark" else "GRAY light"
            THEME_BLUEGRAY   -> themeName = if ( mIsNightMode) "BLUEGRAY dark" else "BLUEGRAY light"
            THEME_DARKSIDE   -> themeName = if ( mIsNightMode) "Darkside" else "Lightside"
            else             -> {
            }
        }
        return themeName
    }

    @JvmStatic val themeList: ArrayList<Theme>
        get() {
            val themeArrayList = ArrayList<Theme>()
            themeArrayList.add(Theme(0, R.color.primaryColorRed, R.color.primaryDarkColorRed, R.color.secondaryColorRed))
            themeArrayList.add(Theme(1, R.color.primaryColorPink, R.color.primaryDarkColorPink, R.color.secondaryColorPink))
            themeArrayList.add(Theme(2, R.color.primaryColorPurple, R.color.primaryDarkColorPurple, R.color.secondaryColorPurple))
            themeArrayList.add(Theme(3, R.color.primaryColorDeepPurple, R.color.primaryDarkColorDeepPurple, R.color.secondaryColorDeepPurple))
            themeArrayList.add(Theme(4, R.color.primaryColorIndigo, R.color.primaryDarkColorIndigo, R.color.secondaryColorIndigo))
            themeArrayList.add(Theme(5, R.color.primaryColorBlue, R.color.primaryDarkColorBlue, R.color.secondaryColorBlue))
            themeArrayList.add(Theme(6, R.color.primaryColorLightBlue, R.color.primaryDarkColorLightBlue, R.color.secondaryColorLightBlue))
            themeArrayList.add(Theme(7, R.color.primaryColorCyan, R.color.primaryDarkColorCyan, R.color.secondaryColorCyan))
            themeArrayList.add(Theme(8, R.color.primaryColorTeal, R.color.primaryDarkColorTeal, R.color.secondaryColorTeal))
            themeArrayList.add(Theme(9, R.color.primaryColorGreen, R.color.primaryDarkColorGreen, R.color.secondaryColorGreen))
            themeArrayList.add(Theme(10, R.color.primaryColorLightGreen, R.color.primaryDarkColorLightGreen, R.color.secondaryColorLightGreen))
            themeArrayList.add(Theme(11, R.color.primaryColorLime, R.color.primaryDarkColorLime, R.color.secondaryColorLime))
            themeArrayList.add(Theme(12, R.color.primaryColorYellow, R.color.primaryDarkColorYellow, R.color.secondaryColorYellow))
            themeArrayList.add(Theme(13, R.color.primaryColorAmber, R.color.primaryDarkColorAmber, R.color.secondaryColorAmber))
            themeArrayList.add(Theme(14, R.color.primaryColorOrange, R.color.primaryDarkColorOrange, R.color.secondaryColorOrange))
            themeArrayList.add(Theme(15, R.color.primaryColorDeepOrange, R.color.primaryDarkColorDeepOrange, R.color.secondaryColorDeepOrange))
            themeArrayList.add(Theme(16, R.color.primaryColorBrown, R.color.primaryDarkColorBrown, R.color.secondaryColorBrown))
            themeArrayList.add(Theme(17, R.color.primaryColorGray, R.color.primaryDarkColorGray, R.color.secondaryColorGray))
            themeArrayList.add(Theme(18, R.color.primaryColorBlueGray, R.color.primaryDarkColorBlueGray, R.color.secondaryColorBlueGray))
            themeArrayList.add(Theme(19, R.color.primaryColorDarkside, R.color.primaryDarkColorDarkside, R.color.secondaryColorDarkside))
            return themeArrayList
        }
}