package com.example.valorantmapsview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.valorantmapsview.ui.theme.ValorantMapsViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewContainer()
        }
    }
}

@Preview
@Composable
fun ViewContainer() {
    Scaffold(

        content = { Content() }
    )
}

@Composable
fun Content() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.Blue_Chido))
    ) {
        item {
            Text(
                text = "MAPAS VALORANT COMPETITIVO",
                color = colorResource(id = R.color.white),
                modifier = Modifier.fillMaxWidth(),
                fontSize = 32.sp,
                textAlign = TextAlign.Center,
                style = TextStyle(fontWeight = FontWeight.Bold)
            )
            Text(
                text = "LOTUS",
                fontSize = 28.sp,
                color = Color.White,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(16.dp)
            )
            LazyRow(

                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(BorderStroke(4.dp, Color.White))
            ) {

                item {

                    Image(
                        painter = painterResource(id = R.drawable.lotus1),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.lotusminimap),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.lotus3),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.lotus4),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.lotus5),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.lotus6),
                        contentDescription = "Lotus"
                    )


                }
            }
            Text(
                text = "PEARL",
                fontSize = 28.sp,
                color = Color.White,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(16.dp)
            )
            LazyRow(

                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(BorderStroke(4.dp, Color.White))
            ) {
                item {
                    Image(

                        painter = painterResource(id = R.drawable.pearl1),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.pear2),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.pearl3),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.pearl4),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.pearl5),
                        contentDescription = "Lotus"
                    )


                }
            }
            Text(
                text = "FRACTURE",
                fontSize = 28.sp,
                color = Color.White,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(16.dp)
            )
            LazyRow(

                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(BorderStroke(4.dp, Color.White))
            ) {
                item {
                    Image(

                        painter = painterResource(id = R.drawable.fracture1),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.fracture2),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.fracture3),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.fracture4),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.fracture5),
                        contentDescription = "Lotus"
                    )


                }
            }
            Text(
                text = "BIND",
                fontSize = 28.sp,
                color = Color.White,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(16.dp)
            )
            LazyRow(

                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(BorderStroke(4.dp, Color.White))
            ) {
                item {
                    Image(

                        painter = painterResource(id = R.drawable.bind1),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.bind2),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.bind3),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.bind4),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.bind5),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.bind6),
                        contentDescription = "Lotus"
                    )


                }
            }
            Text(
                text = "HAVEN",
                fontSize = 28.sp,
                color = Color.White,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(16.dp)
            )
            LazyRow(

                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(BorderStroke(4.dp, Color.White))
            ) {
                item {
                    Image(

                        painter = painterResource(id = R.drawable.haven1),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.haven2),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.haven3),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.haven4),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.haven5),
                        contentDescription = "Lotus"
                    )

                }
            }
            Text(
                text = "SPLIT",
                fontSize = 28.sp,
                color = Color.White,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(16.dp)
            )
            LazyRow(

                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(BorderStroke(4.dp, Color.White))
            ) {
                item {
                    Image(

                        painter = painterResource(id = R.drawable.split1),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.spli2),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.split3),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.split4),
                        contentDescription = "Lotus"
                    )

                }
            }
            Text(
                text = "ASCENT",
                fontSize = 28.sp,
                color = Color.White,
                style = TextStyle(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(16.dp)
            )
            LazyRow(

                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(BorderStroke(4.dp, Color.White))
            ) {
                item {
                    Image(

                        painter = painterResource(id = R.drawable.ascent1),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.ascent2),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.ascent3),
                        contentDescription = "Lotus"
                    )
                    Image(

                        painter = painterResource(id = R.drawable.ascent4),
                        contentDescription = "Lotus"
                    )

                }
            }

        }
    }
}
