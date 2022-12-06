package br.com.devcapu.exemplosarquitetura.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.devcapu.exemplosarquitetura.R
import br.com.devcapu.exemplosarquitetura.ui.stateholder.CardCursoUiState
import br.com.devcapu.exemplosarquitetura.ui.theme.ExemplosArquiteturaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExemplosArquiteturaTheme {
                CardCurso(CardCursoUiState())
            }
        }
    }
}

@Composable
fun CardCurso(cursoUiState: CardCursoUiState) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                modifier = Modifier.size(64.dp),
                painter = painterResource(id = R.drawable.kotlin),
                contentDescription = null,
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(2.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    LinearProgressIndicator(progress = 0.75f)
                    if (true) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_baseline_assignment_turned_in_24),
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
                Text(
                    text = "Android com Kotlin",
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp
                )
                Text(text = "testes instrumentados")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExemplosArquiteturaTheme {
        CardCurso(CardCursoUiState())
    }
}