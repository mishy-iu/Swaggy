package com.mitchelle.swaggy.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mitchelle.swaggy.R
import com.mitchelle.swaggy.ui.theme.lightlight
import com.mitchelle.swaggy.ui.theme.mishmish


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        //TopAppBar

        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = mishmish,
                titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White

            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu"
                    )
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "cart"
                    )

                }

                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "notification"
                    )

                }
            }


        )

        //End of TopAppBar

        Image(
            painter = painterResource(R.drawable.wonder),
            contentDescription = "wonder",
            modifier = Modifier.fillMaxWidth().height(250.dp),
            contentScale = ContentScale.FillWidth

        )

        Spacer(modifier = Modifier.height(10.dp))

        //SearchBar

        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") },
            placeholder = { Text(text = "search products....") },
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = lightlight
            )
        )



        //End of SearchBar


        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Other Products",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

        )

        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            //Row

            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.commerce),
                    contentDescription = "commerce",
                    modifier = Modifier.size(width = 200.dp, height = 200.dp).clip(shape = RoundedCornerShape(40.dp))
                )

                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(text = "Stylish cotton shirt", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Brand name:Alexander Macqueen", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(text = "Price: ksh 2000", fontSize = 15.sp, textDecoration = TextDecoration.LineThrough)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(text = "Now: ksh 1000", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(5.dp))

                    Row( ){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Black)
                    }

                    Button(onClick = {},

                        ) {
                        Text(text = "Buy now...")
                    }








                }



            }
            //End of Row

            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier.padding(start = 20.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.stalion),
                    contentDescription = "stalion",
                    modifier = Modifier.size(width = 200.dp, height = 200.dp).clip(shape = RoundedCornerShape(40.dp))
                )

                Spacer(modifier = Modifier.width(10.dp))

                Column() {
                    Text(text = "Black Stallion", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(text = "Brand name:Stalion", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(text = "Price: ksh 200000", fontSize = 15.sp, textDecoration = TextDecoration.LineThrough)
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(text = "Now: ksh 100000", fontSize = 15.sp)
                    Spacer(modifier = Modifier.height(5.dp))

                    Row( ){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Blue)
                        Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = Color.Black)
                    }

                    Button(onClick = {},

                        ) {
                        Text(text = "Buy now...")
                    }








                }



            }





        }






    }





}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())
}