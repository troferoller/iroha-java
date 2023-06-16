//
// Auto-generated file. DO NOT EDIT!
//
package jp.co.soramitsu.iroha2.generated.datamodel.events.`data`.events.asset

import jp.co.soramitsu.iroha2.ModelEnum
import jp.co.soramitsu.iroha2.codec.ScaleCodecReader
import jp.co.soramitsu.iroha2.codec.ScaleCodecWriter
import jp.co.soramitsu.iroha2.codec.ScaleReader
import jp.co.soramitsu.iroha2.codec.ScaleWriter
import jp.co.soramitsu.iroha2.wrapException
import kotlin.Any
import kotlin.Boolean
import kotlin.Int

/**
 * AssetDefinitionEventFilter
 *
 * Generated from 'iroha_data_model::events::data::events::asset::AssetDefinitionEventFilter' enum
 */
public sealed class AssetDefinitionEventFilter : ModelEnum {
    /**
     * @return Discriminator of variant in enum
     */
    public abstract fun discriminant(): Int

    public override fun equals(other: Any?) = when (this) {
        is ByCreated -> ByCreated.equals(this, other)
        is ByMintabilityChanged -> ByMintabilityChanged.equals(this, other)
        is ByOwnerChanged -> ByOwnerChanged.equals(this, other)
        is ByDeleted -> ByDeleted.equals(this, other)
        is ByMetadataInserted -> ByMetadataInserted.equals(this, other)
        is ByMetadataRemoved -> ByMetadataRemoved.equals(this, other)
        is ByTotalQuantityChanged -> ByTotalQuantityChanged.equals(this, other)
        else -> super.equals(other)
    }

    public override fun hashCode() = when (this) {
        is ByCreated -> ByCreated.hashCode()
        is ByMintabilityChanged -> ByMintabilityChanged.hashCode()
        is ByOwnerChanged -> ByOwnerChanged.hashCode()
        is ByDeleted -> ByDeleted.hashCode()
        is ByMetadataInserted -> ByMetadataInserted.hashCode()
        is ByMetadataRemoved -> ByMetadataRemoved.hashCode()
        is ByTotalQuantityChanged -> ByTotalQuantityChanged.hashCode()
        else -> super.hashCode()
    }

    /**
     * 'ByCreated' variant
     */
    public class ByCreated : AssetDefinitionEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByCreated>, ScaleWriter<ByCreated> {
            public const val DISCRIMINANT: Int = 0

            public override fun read(reader: ScaleCodecReader): ByCreated = try {
                ByCreated()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByCreated) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByCreated, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int =
                "datamodel.events.data.events.asset.AssetDefinitionEventFilter.ByCreated".hashCode()
        }
    }

    /**
     * 'ByMintabilityChanged' variant
     */
    public class ByMintabilityChanged : AssetDefinitionEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByMintabilityChanged>, ScaleWriter<ByMintabilityChanged> {
            public const val DISCRIMINANT: Int = 1

            public override fun read(reader: ScaleCodecReader): ByMintabilityChanged = try {
                ByMintabilityChanged()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByMintabilityChanged) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByMintabilityChanged, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int =
                "datamodel.events.data.events.asset.AssetDefinitionEventFilter.ByMintabilityChanged".hashCode()
        }
    }

    /**
     * 'ByOwnerChanged' variant
     */
    public class ByOwnerChanged : AssetDefinitionEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByOwnerChanged>, ScaleWriter<ByOwnerChanged> {
            public const val DISCRIMINANT: Int = 2

            public override fun read(reader: ScaleCodecReader): ByOwnerChanged = try {
                ByOwnerChanged()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByOwnerChanged) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByOwnerChanged, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int =
                "datamodel.events.data.events.asset.AssetDefinitionEventFilter.ByOwnerChanged".hashCode()
        }
    }

    /**
     * 'ByDeleted' variant
     */
    public class ByDeleted : AssetDefinitionEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByDeleted>, ScaleWriter<ByDeleted> {
            public const val DISCRIMINANT: Int = 3

            public override fun read(reader: ScaleCodecReader): ByDeleted = try {
                ByDeleted()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByDeleted) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByDeleted, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int =
                "datamodel.events.data.events.asset.AssetDefinitionEventFilter.ByDeleted".hashCode()
        }
    }

    /**
     * 'ByMetadataInserted' variant
     */
    public class ByMetadataInserted : AssetDefinitionEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByMetadataInserted>, ScaleWriter<ByMetadataInserted> {
            public const val DISCRIMINANT: Int = 4

            public override fun read(reader: ScaleCodecReader): ByMetadataInserted = try {
                ByMetadataInserted()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByMetadataInserted) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByMetadataInserted, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int =
                "datamodel.events.data.events.asset.AssetDefinitionEventFilter.ByMetadataInserted".hashCode()
        }
    }

    /**
     * 'ByMetadataRemoved' variant
     */
    public class ByMetadataRemoved : AssetDefinitionEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object : ScaleReader<ByMetadataRemoved>, ScaleWriter<ByMetadataRemoved> {
            public const val DISCRIMINANT: Int = 5

            public override fun read(reader: ScaleCodecReader): ByMetadataRemoved = try {
                ByMetadataRemoved()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByMetadataRemoved) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByMetadataRemoved, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int =
                "datamodel.events.data.events.asset.AssetDefinitionEventFilter.ByMetadataRemoved".hashCode()
        }
    }

    /**
     * 'ByTotalQuantityChanged' variant
     */
    public class ByTotalQuantityChanged : AssetDefinitionEventFilter() {
        public override fun discriminant(): Int = DISCRIMINANT

        public companion object :
            ScaleReader<ByTotalQuantityChanged>,
            ScaleWriter<ByTotalQuantityChanged> {
            public const val DISCRIMINANT: Int = 6

            public override fun read(reader: ScaleCodecReader): ByTotalQuantityChanged = try {
                ByTotalQuantityChanged()
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public override fun write(writer: ScaleCodecWriter, instance: ByTotalQuantityChanged) = try {
            } catch (ex: Exception) {
                throw wrapException(ex)
            }

            public fun equals(o1: ByTotalQuantityChanged, o2: Any?): Boolean = when (o2) {
                null -> false
                else -> o2::class == o1::class
            }

            public override fun hashCode(): Int =
                "datamodel.events.data.events.asset.AssetDefinitionEventFilter.ByTotalQuantityChanged".hashCode()
        }
    }

    public companion object :
        ScaleReader<AssetDefinitionEventFilter>,
        ScaleWriter<AssetDefinitionEventFilter> {
        public override fun read(reader: ScaleCodecReader): AssetDefinitionEventFilter = when (
            val
            discriminant = reader.readUByte()
        ) {
            0 -> ByCreated.read(reader)
            1 -> ByMintabilityChanged.read(reader)
            2 -> ByOwnerChanged.read(reader)
            3 -> ByDeleted.read(reader)
            4 -> ByMetadataInserted.read(reader)
            5 -> ByMetadataRemoved.read(reader)
            6 -> ByTotalQuantityChanged.read(reader)
            else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
        }

        public override fun write(writer: ScaleCodecWriter, instance: AssetDefinitionEventFilter) {
            writer.directWrite(instance.discriminant())
            when (val discriminant = instance.discriminant()) {
                0 -> ByCreated.write(writer, instance as ByCreated)
                1 -> ByMintabilityChanged.write(writer, instance as ByMintabilityChanged)
                2 -> ByOwnerChanged.write(writer, instance as ByOwnerChanged)
                3 -> ByDeleted.write(writer, instance as ByDeleted)
                4 -> ByMetadataInserted.write(writer, instance as ByMetadataInserted)
                5 -> ByMetadataRemoved.write(writer, instance as ByMetadataRemoved)
                6 -> ByTotalQuantityChanged.write(writer, instance as ByTotalQuantityChanged)
                else -> throw RuntimeException("Unresolved discriminant of the enum variant: $discriminant")
            }
        }
    }
}
