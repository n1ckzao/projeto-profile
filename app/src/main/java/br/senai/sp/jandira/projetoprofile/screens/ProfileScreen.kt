package br.senai.sp.jandira.projetoprofile.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.projetoprofile.R

@Composable
fun ProfileScreen(name: String, modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(RoundedCornerShape(bottomStart = 16.dp, bottomEnd = 16.dp)),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Detalhes",
                    color = Color.White,
                    fontSize = 14.sp
                )
                Card(
                    modifier = Modifier
                        .size(75.dp),
                    shape = CircleShape
                ){
                    Image(
                        painter = painterResource(R.drawable.profile),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Text(
                    text = "EUEUUEUEUEUEU",
                    color = Color.White,
                    fontSize = 14.sp
                )
                Text(
                    text = "Web Designer",
                    color = Color.Gray,
                    fontSize = 14.sp
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Card(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(90.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        border = BorderStroke(1.dp, Color.White)
                    ){
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ){
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "",
                                tint = Color.White
                            )
                            Text(
                                text = "Email",
                                color = Color.White
                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(90.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
                        border = BorderStroke(1.dp, Color.White)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Call,
                                contentDescription = "",
                                tint = Color.White
                            )
                            Text(
                                text = "Call",
                                color = Color.White
                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(90.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        border = BorderStroke(1.dp, Color.White)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "",
                                tint = Color.White
                            )
                            Text(
                                text = "Whatsapp",
                                color = Color.White
                            )
                        }
                    }
                    Card(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(90.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.Transparent
                        ),
                        border = BorderStroke(1.dp, Color.White)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "",
                                tint = Color.White
                            )
                            Text(
                                text = "Favorite",
                                color = Color.White
                            )
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(600.dp)
                    .padding(8.dp)
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 6.dp)
                        .height(30.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "",
                    tint = Color.Red
                )
                    Text(
                        text = "Email",
                        modifier = Modifier
                            .padding(start = 6.dp)
                    )
                }
                Column (
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(30.dp)
                ){
                    Text(
                        text = "Official"
                    )
                    Text(
                        text = "meuemail@email.com"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileScreenPreview() {
    ProfileScreen(name = "ProfileScreen")
}
