package com.mitchelle.swaggy.ui.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mitchelle.swaggy.R
import com.mitchelle.swaggy.ui.theme.elegant
import com.mitchelle.swaggy.ui.theme.lightlight
import com.mitchelle.swaggy.ui.theme.mishmish
import com.mitchelle.swaggy.ui.theme.white

@Composable
fun AboutScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize().background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){


        Image(
            painter = painterResource(R.drawable.easy),
            contentDescription = "",
            modifier = Modifier.size(300.dp)

        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
             text = "Easy Shopping",
             fontSize = 40.sp,
             color = Color.Black,
             fontWeight = FontWeight.ExtraBold

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(

            text = "an online or physical retail experience designed to be convenient and user-friendly, making the process of browsing, selecting, and purchasing goods or services straightforward and efficient",
            fontSize = 15.sp,
            color = Color.Black,
            textAlign = TextAlign.Center

        
        )

        Spacer(modifier = Modifier.height(30.dp))
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically

    ) {

        Image(
            painter = painterResource(R.drawable.img),
            contentDescription = "",
            modifier = Modifier.size(50.dp)

        )



        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.LightGray),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(text = "Skip")
        }
    }
       

    }





}

@Preview
@Composable
fun AboutScreenPreview(){
    AboutScreen(rememberNavController())
}
