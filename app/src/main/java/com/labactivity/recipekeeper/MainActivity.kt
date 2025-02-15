package com.labactivity.recipekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.labactivity.recipekeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //new way = view binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddRecipe.setOnClickListener()
        {
            val recipe: String = binding.edtRecipeName.text.toString()
            binding.edtRecipeArea.text = recipe
        }

        binding.btnAddIngredients.setOnClickListener()
        {
            val ingredients: String = binding.edtIngredients.text.toString()
            binding.edtRecipeArea2.text = "Ingredients \n\n $ingredients"
        }

        binding.btnAddInstructions.setOnClickListener()
        {
            val instructions: String = binding.edtInstructions.text.toString()
            binding.edtRecipeArea3.text = "Instructions \n\n $instructions"
        }

            binding.btnSaveRecipe.setOnClickListener()
            {
                val empty: String = ""

                val edt1: String = binding.edtRecipeName.text.toString()
                val edt2: String = binding.edtIngredients.text.toString()
                val edt3: String = binding.edtInstructions.text.toString()

                if (edt1 == empty)
                {
                    Toast.makeText(applicationContext, "Please complete all Required Information", Toast.LENGTH_SHORT).show()

                }
                else if (edt2 == empty)
                {
                    Toast.makeText(applicationContext, "Please complete all Required Information", Toast.LENGTH_SHORT).show()

                }
                else if (edt3 == empty)
                {
                    Toast.makeText(applicationContext, "Please complete all Required Information", Toast.LENGTH_SHORT).show()

                }
                else if (edt1 >= empty)
                {
                    Toast.makeText(applicationContext, "Recipe Saved", Toast.LENGTH_SHORT).show()

                }
                else if (edt2 >= empty)
                {
                    Toast.makeText(applicationContext, "Recipe Saved", Toast.LENGTH_SHORT).show()

                }
                else if (edt3 >= empty)
                {
                    Toast.makeText(applicationContext, "Recipe Saved", Toast.LENGTH_SHORT).show()

                } else
                    Toast.makeText(applicationContext, "Please complete all Required Information", Toast.LENGTH_SHORT).show()

                }

                binding.btnClear.setOnClickListener()
                {
                    binding.edtRecipeName.text.clear()
                    binding.edtIngredients.text.clear()
                    binding.edtInstructions.text.clear()

                    binding.edtRecipeArea.setText("")
                    binding.edtRecipeArea2.setText("")
                    binding.edtRecipeArea3.setText("")

                }

            }
        }