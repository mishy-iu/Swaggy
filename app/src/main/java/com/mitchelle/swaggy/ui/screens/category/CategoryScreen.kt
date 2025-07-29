package com.mitchelle.swaggy.ui.screens.category

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mitchelle.swaggy.R
import com.mitchelle.swaggy.navigation.ROUT_DETAIL
import com.mitchelle.swaggy.navigation.ROUT_ITEM
import com.mitchelle.swaggy.ui.theme.mishmish

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //TopAppBar

        TopAppBar(
            title = { Text(text = "Other Categories") },
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
                        imageVector = Icons.Default.Share,
                        contentDescription = "cart"
                    )

                }

                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "notification"
                    )

                }
            }


        )

        //End of TopAppBar
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Welcome to Swaggy!!",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),

        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Discover unique styles accross category. Find something for every vibe.",
            fontSize = 15.sp,

            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),

            )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Shop by Category",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),

            )
        Spacer(modifier = Modifier.height(10.dp))

        //Card

        Card(
            onClick = {},
            modifier = Modifier.fillMaxWidth().height(150.dp).padding(start = 20.dp, end = 20.dp)

        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.wonder),
                    contentDescription = "wonder",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds

                )

                Text(
                    text = "ContactLens",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
                    color = Color.White

                    )
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "favourite",
                    modifier = Modifier.align(alignment = Alignment.TopStart).padding(10.dp),
                    tint = Color.White
                )



            }

        }

        //end of Card
        Spacer(modifier = Modifier.height(20.dp))

        //Card

        Card(
            onClick = {},
            modifier = Modifier.fillMaxWidth().height(150.dp).padding(start = 20.dp, end = 20.dp)

        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.wstalion),
                    contentDescription = "stalion",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds

                )

                Text(
                    text = "Stalion",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
                    color = Color.White

                )
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "favourite",
                    modifier = Modifier.align(alignment = Alignment.TopStart).padding(10.dp),
                    tint = Color.White
                )










            }

        }

        //end of Card
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "More categories coming soon....",
            fontSize = 15.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 80.dp)

        )


        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                navController.navigate(ROUT_DETAIL)
            },
            colors = ButtonDefaults.buttonColors(mishmish),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 50.dp, end = 50.dp)



        ) {
            Text(text = "Explore All Products")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Follow us on Instagram @swaggy_ke",
            fontSize = 15.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 40.dp)


        )
        Text(
            text = "Need help? Contact us at support@swaggy.co.ke",
            fontSize = 15.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 40.dp)

        )
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Wear the vibe.Live the vibe.",
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier.padding(start = 40.dp),
            fontWeight = FontWeight.Bold

        )















    }





}

@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview(){
    CategoryScreen(rememberNavController())
}