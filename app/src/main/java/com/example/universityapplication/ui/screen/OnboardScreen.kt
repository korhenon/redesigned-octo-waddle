package com.example.universityapplication.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.universityapplication.R
import com.example.universityapplication.ui.navigation.Home
import com.example.universityapplication.ui.theme.IndicationLine
import com.example.universityapplication.ui.theme.OnboardBackground
import com.example.universityapplication.ui.theme.OnboardButtonBackground
import com.example.universityapplication.ui.theme.OnboardButtonText
import com.example.universityapplication.ui.theme.PrimaryRed
import com.example.universityapplication.ui.theme.lato

// TODO: Градиент
@Composable
fun OnboardScreen(navController: NavHostController) {
    Column(
        Modifier
            .fillMaxWidth()
            .background(OnboardBackground)
    ) {
        Image(
            painter = painterResource(id = R.drawable.onboard),
            contentDescription = "",
            modifier = Modifier.height(400.dp),
            contentScale = ContentScale.FillHeight
        )
        Column(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(PrimaryRed, RoundedCornerShape(30.dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(26.dp))
            Text(
                text = "Fırat Üniversitesi \n" + "Mobil Uygulamasına \n" + "Hoşgeldiniz!",
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 34.sp,
                fontFamily = lato,
                color = Color.White,
                lineHeight = 34.sp
            )
            Spacer(modifier = Modifier.height(26.dp))
            Text(
                text = "Lorem ipsum dolor sit amet, consec\n" + "tetur adipiscing elit.",
                fontFamily = lato,
                fontSize = 18.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(33.dp))
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 54.dp, end = 66.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    Modifier
                        .clickable {
                            navController.navigate(Home)
                        }
                        .shadow(
                            20.dp,
                            RoundedCornerShape(
                                topStart = 30.dp,
                                bottomStart = 30.dp,
                                bottomEnd = 30.dp,
                            )
                        )
                        .background(
                            OnboardButtonBackground,
                            RoundedCornerShape(
                                topStart = 30.dp,
                                bottomStart = 30.dp,
                                bottomEnd = 30.dp,
                            )
                        )
                        .padding(horizontal = 22.dp, vertical = 9.dp),
                ) {
                    Text(
                        text = "Keşfet",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = OnboardButtonText,
                        fontFamily = lato
                    )
                }
                Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                    Box(
                        Modifier
                            .height(10.dp)
                            .width(30.dp)
                            .background(IndicationLine, CircleShape)
                    )
                    Box(
                        Modifier
                            .height(10.dp)
                            .width(10.dp)
                            .background(Color.White, CircleShape)
                    )
                    Box(
                        Modifier
                            .height(10.dp)
                            .width(10.dp)
                            .background(Color.White, CircleShape)
                    )
                }
            }
        }
    }
}