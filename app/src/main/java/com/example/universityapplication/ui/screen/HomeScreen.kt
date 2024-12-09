package com.example.universityapplication.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.text.ParagraphIntrinsics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.universityapplication.R
import com.example.universityapplication.ui.navigation.Menu
import com.example.universityapplication.ui.theme.HomeTitle
import com.example.universityapplication.ui.theme.PingPongText
import com.example.universityapplication.ui.theme.PrimaryRed
import com.example.universityapplication.ui.theme.lato

@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterStart) {
            Image(
                painter = painterResource(id = R.drawable.burger),
                contentDescription = "",
                modifier = Modifier
                    .padding(10.dp)
                    .clickable {
                        navController.navigate(Menu)
                    }
            )
            Text(
                text = "Fırat Üniversitesi",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontFamily = lato,
                fontSize = 30.sp,
                color = PrimaryRed,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            PingPong(icon = R.drawable.vilka_nozh, text = "Yemekhane")
            PingPong(icon = R.drawable.card, text = "Bakiye Yükle")
            PingPong(icon = R.drawable.notebook, text = "Ders Programı")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            PingPong(icon = R.drawable.card, text = "Takvim")
            PingPong(icon = R.drawable.people, text = "Akademisyenler")
            PingPong(icon = R.drawable.vopros, text = "İletişim")
        }
        Spacer(modifier = Modifier.height(54.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "DUYURULAR",
                fontSize = 22.sp,
                fontWeight = FontWeight.ExtraBold,
                color = HomeTitle,
                fontFamily = lato
            )
            Column(Modifier.width(IntrinsicSize.Max)) {
                Text(
                    text = "Tümünü Göster",
                    fontFamily = lato,
                    fontWeight = FontWeight.ExtraBold,
                    color = PingPongText
                )
                Spacer(modifier = Modifier.height(5.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(PrimaryRed)
                )
            }
        }
        Spacer(modifier = Modifier.height(38.dp))
        Row(Modifier.padding(start = 34.dp)) {
            EventCard()
        }
        Spacer(modifier = Modifier.height(37.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 34.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "HABERLER",
                fontSize = 22.sp,
                fontWeight = FontWeight.ExtraBold,
                color = HomeTitle,
                fontFamily = lato
            )
            Column(Modifier.width(IntrinsicSize.Max)) {
                Text(
                    text = "Tümünü Göster",
                    fontFamily = lato,
                    fontWeight = FontWeight.ExtraBold,
                    color = PingPongText
                )
                Spacer(modifier = Modifier.height(5.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(PrimaryRed)
                )
            }
        }
    }
}

@Composable
fun PingPong(icon: Int, text: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.shadow(15.dp, CircleShape)) {
            Image(
                painter = painterResource(id = R.drawable.ping_pong_ball),
                contentDescription = ""
            )
            Image(painter = painterResource(id = icon), contentDescription = "")
        }
        Spacer(modifier = Modifier.height(13.dp))
        Text(
            text = text,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = lato,
            color = PingPongText
        )
    }
}

@Composable
fun EventCard() {
    Box(
        modifier = Modifier
            .background(Color.White, RoundedCornerShape(20.dp))
            .padding(start = 4.dp, top = 1.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.event_image),
            contentDescription = "",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.height(107.dp)
        )
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier.padding(start = 12.dp, top = 18.dp),
        ) {
            Text(
                text = "2022 TÜBA Uluslararası\n" +
                        "Akademi Ödülleri Çağrısı",
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontFamily = lato
            )
            Spacer(modifier = Modifier.height(19.dp))
            Text(
                text = "18.01.2022",
                fontFamily = lato,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                color = Color.White
            )
        }
    }
}